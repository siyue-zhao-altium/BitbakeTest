DESCRIPTION = "Hello World Example"
LICENSE = "CLOSED"

inherit allarch

SRC_URI = "file://helloworld.txt"

#do_install() {
    # Copy the fake helloworld.txt file into the image directory
    # cp ${WORKDIR}/helloworld.txt ${D}/usr/share/helloworld.txt
    #install -m 0644 ${WORKDIR}/helloworld.txt ${D}/usr/share/
#    echo "hello world"
#}

S = "${WORKDIR}"

do_install() {
    echo "${HELLO_MESSAGE}" > ${D}${bindir}/helloworld.txt
}

FILES_${PN} += "${bindir}/helloworld.txt"

inherit deploy

do_deploy() {
    install -D ${D}${bindir}/helloworld.txt ${DEPLOYDIR}/helloworld.txt
}

addtask deploy after do_install before do_package

INSANE_SKIP:${PN} = "file-rdeps"

