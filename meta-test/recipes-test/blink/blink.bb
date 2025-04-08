DESCRIPTION = "Hello World Blink Version"
LICENSE = "CLOSED"

inherit base

addtask install before do_build

do_install() {
    echo "Temp Directory TMPDIR is set to: ${TMPDIR} \n
    Top Directory TOPDIR is set to: ${TOPDIR} \n
    The file is created at: $(date +"%Y-%m-%d %H:%M:%S") \n
    Hello World Message: ${HELLO_MESSAGE} \n
    The local.conf:\n" > ${WORKDIR}/blink.txt  
    cat ${TOPDIR}/conf/local.conf >> ${WORKDIR}/blink.txt
    echo "The .config in ${TOPDIR}/.." >> ${WORKDIR}/blink.txt
    cat ${TOPDIR}/../.config >> ${WORKDIR}/blink.txt
    echo "The .config in ${TOPDIR}/../repo" >> ${WORKDIR}/blink.txt
    cat ${TOPDIR}/../repo/.config >> ${WORKDIR}/blink.txt
    echo "The .config.yaml in ${TOPDIR}/../repo" >> ${WORKDIR}/blink.txt
    cat ${TOPDIR}/../repo/.config.yaml >> ${WORKDIR}/blink.txt
}

FILES_${PN} += "${bindir}/blink.txt"

addtask deploy after do_install before do_build

do_deploy() {
    install -D ${WORKDIR}/blink.txt ${DEPLOY_DIR}/blink.txt
}

