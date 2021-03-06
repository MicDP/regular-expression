#!/usr/bin/perl
use strict;
use warnings FATAL => 'all';
# 打印具体的报错信息
use diagnostics;

open my $fh, '<', 'src/main/resources/data/test37.txt' or die "Can't open file $!";
my $file_content = do {
    local $/;
    <$fh>
};

print($file_content);
print("\n");
print("--------------\n");

# Perl 表达式实现正则表达式嵌入条件。
while ($file_content =~ m/(<[Aa]\s+[^>]+>\s*)?<[Ii][Mm][Gg]\s+[^>]+>(?(1)\s*<\/[Aa]>)/gm) {
    print "匹配的字符串: $&\n";
}