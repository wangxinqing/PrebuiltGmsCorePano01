package defpackage;

import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: aryk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryk {
    public static String a(TrueWirelessHeadset trueWirelessHeadset, amsv amsv, amsv amsv2, amsv amsv3) {
        StringBuilder sb = new StringBuilder();
        if (TrueWirelessHeadset.a(trueWirelessHeadset.b().b())) {
            sb.append((String) amsv.a());
            sb.append(' ');
        }
        if (TrueWirelessHeadset.a(trueWirelessHeadset.d().b())) {
            sb.append((String) amsv2.a());
            sb.append(' ');
        }
        if (TrueWirelessHeadset.a(trueWirelessHeadset.c().b())) {
            sb.append((String) amsv3.a());
        }
        return sb.toString();
    }
}
