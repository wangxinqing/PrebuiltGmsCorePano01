package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: clr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clr {
    static final String a = clv.a("hts/frbslgiggolai.o/0clgbth", "tp:/ieaeogn.ogepscmvc/o/ac");
    static final String b = clv.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    private static final String e = clv.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    public final String c;
    public final String d;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new clo[]{clo.a("proto"), clo.a("json")})));
        new clr(a, (String) null);
        new clr(b, e);
    }

    public clr(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public static clr a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new clr(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
