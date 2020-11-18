meta-aries
==========

This layer provides support for ARIES Embedded Mxx SoM and Mxx EVK for
OE-core/Yocto 3.1 (dunfell).

The following boards are supported:

  * M28EVK
  * M53EVK
  * MCVEVK and MCVEVP
  * MA5D4EVK

This Yocto layer could be used to build an embedded Linux distribution
as shown below. The example is for the MCVEVP. For other EVKs just
substitue the machine name "mcvevk" with the name of your EVK:

  * Create a working directory:

        $ mkdir <work_dir>

  * Get the Yocto sources:

        $ cd <work_dir>
        $ git clone https://github.com/ARIES-Embedded/meta-aries.git
        $ git clone -b dunfell git://git.yoctoproject.org/poky.git
        $ git clone -b dunfell https://github.com/openembedded/meta-openembedded.git

  * Setup the build environment for the MCVEVP:

        $ source poky/oe-init-build-env mcvevk

  * Add the line `MACHINE ?= "mcvevk"` to `conf/local.conf`:

        $ vi conf/local.conf
        ...
        #MACHINE ?= "edgerouter"
        MACHINE ?= "mcvevk"

  * To save disk space you may want to add the line (optional):

        INHERIT += "rm_work"

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

Other useful resources:

  * [Yocto 'BSP Layer'](http://www.yoctoproject.org/docs/2.6/mega-manual/mega-manual.html#bsp-layers)
  * [Yocto 'Getting Setup'](http://www.yoctoproject.org/docs/2.6/mega-manual/mega-manual.html#getting-setup)
  * [Yocto 'Project Quickstart'](http://www.yoctoproject.org/docs/2.6/yocto-project-qs/yocto-project-qs.html)
  * Hardware Manuals and Quick Start Guide from the [ARIES Embedded WEB site](http://www.aries-embedded.de)
