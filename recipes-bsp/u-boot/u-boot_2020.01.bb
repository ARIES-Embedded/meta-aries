require u-boot-common_${PV}.inc
require u-boot.inc

DEPENDS += "dtc-native bc-native"

do_compile:append:m28evk () {
	./tools/mxsboot sd u-boot.sb u-boot.sd
	./tools/mxsboot nand u-boot.sb u-boot.nand
}

do_install:append:m28evk () {
        install -m 644 ${B}/u-boot.sd \
		${D}/boot/u-boot-${MACHINE}-${PV}-${PR}.sd
        ln -sf u-boot-${MACHINE}-${PV}-${PR}.sd \
		${D}/boot/u-boot.sd

        install -m 644 ${B}/u-boot.nand \
		${D}/boot/u-boot-${MACHINE}-${PV}-${PR}.nand
        ln -sf u-boot-${MACHINE}-${PV}-${PR}.nand \
		${D}/boot/u-boot.nand
}

do_deploy:append:m28evk () {
        install -m 644 ${B}/u-boot.sd \
		${DEPLOYDIR}/u-boot-${MACHINE}-${PV}-${PR}.sd
	rm -f u-boot.sd u-boot-${MACHINE}.sd
        ln -sf u-boot-${MACHINE}-${PV}-${PR}.sd \
		${DEPLOYDIR}/u-boot.sd
        ln -sf u-boot-${MACHINE}-${PV}-${PR}.sd \
		${DEPLOYDIR}/u-boot-${MACHINE}.sd

        install -m 644 ${B}/u-boot.nand \
		${DEPLOYDIR}/u-boot-${MACHINE}-${PV}-${PR}.nand
	rm -f u-boot.nand u-boot-${MACHINE}.nand
        ln -sf u-boot-${MACHINE}-${PV}-${PR}.nand \
		${DEPLOYDIR}/u-boot.nand
        ln -sf u-boot-${MACHINE}-${PV}-${PR}.nand \
		${DEPLOYDIR}/u-boot-${MACHINE}.nand
}

do_compile:append:m53evk () {
	oe_runmake u-boot-with-nand-spl.imx
}

do_install:append:m53evk () {
        install -m 644 ${B}/u-boot-with-nand-spl.imx \
		${D}/boot/u-boot-with-nand-spl-${MACHINE}-${PV}-${PR}.imx
        ln -sf u-boot-with-nand-spl-${MACHINE}-${PV}-${PR}.imx \
		${D}/boot/u-boot-with-nand-spl.imx
}

do_deploy:append:m53evk () {
        install -m 644 ${B}/u-boot-with-nand-spl.imx \
		${DEPLOYDIR}/u-boot-with-nand-spl-${MACHINE}-${PV}-${PR}.imx
	rm -f u-boot-with-nand-spl.imx u-boot-with-nand-spl-${MACHINE}.imx
        ln -sf u-boot-with-nand-spl-${MACHINE}-${PV}-${PR}.imx \
		${DEPLOYDIR}/u-boot-with-nand-spl.imx
        ln -sf u-boot-with-nand-spl-${MACHINE}-${PV}-${PR}.imx \
		${DEPLOYDIR}/u-boot-with-nand-spl-${MACHINE}.imx
}

do_compile:append:ma5d4evk () {
	oe_runmake all
}

do_install:append:ma5d4evk () {
        install -m 644 ${B}/spl/boot.bin ${D}/boot/boot-${MACHINE}-${PV}-${PR}.bin
        ln -sf boot-${MACHINE}-${PV}-${PR}.bin ${D}/boot/boot.bin
}

do_deploy:append:ma5d4evk () {
        install -m 644 ${B}/spl/boot.bin ${DEPLOYDIR}/boot-${MACHINE}-${PV}-${PR}.bin
	rm -f boot.bin boot-${MACHINE}.bin
        ln -sf boot-${MACHINE}-${PV}-${PR}.bin ${DEPLOYDIR}/boot.bin
        ln -sf boot-${MACHINE}-${PV}-${PR}.bin ${DEPLOYDIR}/boot-${MACHINE}.bin
}
