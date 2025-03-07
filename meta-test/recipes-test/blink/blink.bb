DESCRIPTION = "Hello World Blink Version"
LICENSE = "CLOSED"

do_install() {
    install -d ${D}${bindir} 
    echo "${HELLO_MESSAGE}" > ${D}${bindir}/blink.txt
}

FILES_${PN} += "${bindir}/blink.txt"

inherit deploy

do_deploy() {
    install -D ${D}${bindir}/blink.txt ${DEPLOYDIR}/blink.txt
}

