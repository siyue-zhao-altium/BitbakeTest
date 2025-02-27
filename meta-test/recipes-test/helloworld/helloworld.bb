DESCRIPTION = "Hello World Example"
LICENSE = "CLOSED"

inherit allarch

SRC_URI = "file://helloworld.txt"

do_install() {
    # Copy the fake helloworld.txt file into the image directory
    # cp ${WORKDIR}/helloworld.txt ${D}/usr/share/helloworld.txt
    #install -m 0644 ${WORKDIR}/helloworld.txt ${D}/usr/share/
    echo "hello world"
}


INSANE_SKIP:${PN} = "file-rdeps"

