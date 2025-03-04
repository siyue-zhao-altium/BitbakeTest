DESCRIPTION = "Hello World Example"
LICENSE = "CLOSED"

inherit allarch

SRC_URI = "file://helloworld.txt"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir} 
    echo "${HELLO_MESSAGE}" > ${D}${bindir}/helloworld.txt
}

FILES_${PN} += "${bindir}/helloworld.txt"

inherit deploy

do_deploy() {
    install -D ${D}${bindir}/helloworld.txt ${DEPLOYDIR}/helloworld.txt
}

addtask deploy after do_install before do_package

INSANE_SKIP:${PN} = "file-rdeps"

