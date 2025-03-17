DESCRIPTION = "Hello World Blink Version"
LICENSE = "CLOSED"

inherit base

addtask install before do_build

do_install() {
    echo "Hello World Message: "+${HELLO_MESSAGE} > ${WORKDIR}/blink.txt
}

FILES_${PN} += "${bindir}/blink.txt"

addtask deploy after do_install before do_build

DEPLOYDIR = "${TOPDIR}/tmp/deploy"

do_deploy() {
    install -D ${WORKDIR}/blink.txt ${DEPLOYDIR}/blink.txt
}

