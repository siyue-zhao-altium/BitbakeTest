DESCRIPTION = "Dummy Python 3 interpreter to satisfy build-time dependencies"
LICENSE = "CLOSED"
PR = "r0"

inherit native

do_install() {
    install -d ${D}${bindir}
    echo -e '#!/bin/sh\nexit 0' > ${D}${bindir}/python3
    chmod +x ${D}${bindir}/python3
}

PROVIDES = "python3-native"

