use ExtUtils::MakeMaker;

$CC = 'g++';
$srcdir = '../../src';

# check if we're compiling in the source directory
$ldfrom = "\$(OBJECT) -L$srcdir/.libs -lopenbabel -lz"
    if (-r "$srcdir/.libs/libopenbabel.so") and (-s _) and (-B _);
$ldfrom = "\$(OBJECT) $srcdir/.libs/libopenbabel.a -lz"
    if (-r "$srcdir/.libs/libopenbabel.a") and (-s _) and (-B _);

# See lib/ExtUtils/MakeMaker.pm for details of how to influence
# the contents of the Makefile that is written.
WriteMakefile(
    'NAME'	=>  'Chemistry::OpenBabel',
    'AUTHOR'    =>  'Geoffrey Hutchison <openbabel-scripting@lists.sourceforge.net>',
    'VERSION'   => '1.2.1',
    'LDFROM'    => $ldfrom,
    'CC'        => $CC,
    'LD'        => '$(CC) -shared',
    'INC'       => '-I../../include',
    'OBJECT'    => 'openbabel_perl.o'
);
