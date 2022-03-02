package defpackage;

/* renamed from: acsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsu {
    public static final ikz a = ikz.a("gms:stats:netstats:pattern:idents", " *ident=\\[(?<idents>.*)\\](?: uid=(?<uid>-?[0-9]+))?(?: set=(?<set>\\w+))?(?: tag=0x(?<tag>[0-9a-f]+))?.*");
    public static final ikz b = ikz.a("gms:stats:netstats:pattern:ident", actb.a);
    public static final ikz c = ikz.a("gms:stats:netstats:pattern:history", ".*bucketDuration=(?<duration>[0-9]+).*");
    public static final ikz d = ikz.a("gms:stats:netstats:pattern:bucket", actb.b);
    public static final ikz e = ikz.a("gms:stats:netstats:pattern:uid_start", "UID stats:|Detailed UID stats:");
    public static final ikz f = ikz.a("gms:stats:netstats:pattern:uid_tag_start", "UID tag stats:");
    public static final ikz g = ikz.a("gms:stats:netstats:pattern:type_both", "ALL");
    public static final ikz h = ikz.a("gms:stats:netstats:pattern:type_background", "DEFAULT");
    public static final ikz i = ikz.a("gms:stats:netstats:pattern:type_foreground", "FOREGROUND");
    public static final ikz j = ikz.a("gms:stats:netstats:pattern:type_debug_vpn_in_pattern", "DBG_VPN_IN");
    public static final ikz k = ikz.a("gms:stats:netstats:pattern:type_debug_vpn_out_pattern", "DBG_VPN_OUT");
    public static final ikz l = ikz.a("gms:stats:netstats:pattern:tag_radix", (Integer) 16);
    public static final ikz m = ikz.a("gms:stats:netstats:pattern:ts_to_millis", Integer.valueOf(actb.c));
}
