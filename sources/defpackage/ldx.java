package defpackage;

import com.google.android.gms.drive.DriveId;

/* renamed from: ldx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldx {
    public static DriveId a(krk krk, lnj lnj) {
        iva.a(krk.b(), (Object) "The provided account should be valid.");
        kmp a = krk.a(lnj.g());
        if (a == null) {
            return null;
        }
        DriveId g = a.g();
        a.K();
        a.n(true);
        return g;
    }

    public static DriveId a(krk krk, lnj lnj, boolean z) {
        iva.a(krk.b(), (Object) "The provided account should be valid.");
        return kju.a(krk, lnj, z);
    }
}
