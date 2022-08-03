meta-aries
==========

This layer provides support for ARIES Embedded Mxx SoM and Mxx EVK for
OE-core/Yocto 4.0 (Kirkstone).

The following boards are supported:

  * MCVEVK and MCVEVP
  * MAXEVK
  * M28EVK
  * M53EVK
  * MA5D4EVK

The Liunx Kernel versions 5.10 and 5.15 are supported. By default the
Linux version 5.10 is built.

This Yocto layer could be used to build an embedded Linux distribution
as shown below. The example is for the MCVEVP. For other EVKs just
substitue the machine name "mcvevk" with the name of your EVK:

  * Create a working directory:

        $ mkdir <work_dir>

  * Get the Yocto sources:

        $ cd <work_dir>
        $ git clone -b kirkstone https://github.com/ARIES-Embedded/meta-aries.git
        $ git clone -b kirkstone git://git.yoctoproject.org/poky.git
        $ git clone -b kirkstone https://github.com/openembedded/meta-openembedded.git

  * Setup the build environment for the MCVEVP:

        $ source poky/oe-init-build-env mcvevk

  * Add the line `MACHINE ?= "mcvevk"` to `conf/local.conf`:

        $ vi conf/local.conf
        ...
        #MACHINE ?= "edgerouter"
        MACHINE ?= "mcvevk"

  * To save disk space you may want to add the line (optional):

        INHERIT += "rm_work"

  + If you prefer Kernel version 5.15 instead of 5.10, please add:

        PREFERRED_VERSION_linux-altera-lts = "5.15%"

  * Add the last two lines to `conf/bblayers.conf`:

        $ vi conf/bblayers.conf
        ...
        BBLAYERS ?= " \
          /work/aries/poky/meta \
          /work/aries/poky/meta-poky \
          /work/aries/poky/meta-yocto-bsp \
          /work/aries/meta-openembedded/meta-oe \
          /work/aries/meta-aries \
        "

  * Build the image `core-image-full-cmdline-aries` for the MCVEVK:

        $ bitbake core-image-full-cmdline-aries

    Note: If you prefer a really small image (half the size), please
    build `core-image-minimal-aries` instead.

  * Finally list the build results (images):

        $ ls -1 tmp/deploy/images/mcvevk
        ...
        core-image-full-cmdline-aries-mcvevk.wic.xz  # Compressed full image for the eMMC
        u-boot-with-spl.sfp                    # Content of the "magic" partition
        fitImage                               # FIT image with zImage + DTB file
        socfpga_cyclone5_mcvevk.dtb            # DTB file for old MCVEVP 
        socfpga_cyclone5_mcvevp_rev2_fb.dtb    # DTB file for MCVEVP rev2

Known Issues:

  * U-Boot: on the MCPEVP, the command `ums 0 mmc 0` requires `usb start` to
    be called in advance. Otherwise it does not work!

Other useful resources:

  * [Yocto Project Documentation](https://docs.yoctoproject.org/4.0.2/)
  * Hardware Manuals and Quick Start Guide from the [ARIES Embedded WEB site](http://www.aries-embedded.de)
