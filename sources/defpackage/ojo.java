package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* renamed from: ojo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojo extends bhv implements ojq {
    public ojo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public final void a() {
        c(7, aQ());
    }

    public final void b() {
        c(8, aQ());
    }

    public final void c() {
        b(10, aQ());
    }

    public final void d() {
        b(11, aQ());
    }

    public final void e() {
        b(12, aQ());
    }

    public final void f() {
        b(14, aQ());
    }

    public final void g() {
        b(16, aQ());
    }

    public final void h() {
        b(19, aQ());
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(9, aQ);
    }

    public final void b(byte[] bArr) {
        Parcel aQ = aQ();
        aQ.writeByteArray(bArr);
        b(15, aQ);
    }

    public final void c(byte[] bArr) {
        Parcel aQ = aQ();
        aQ.writeByteArray(bArr);
        b(18, aQ);
    }

    public final void a(GoogleHelp googleHelp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) googleHelp);
        b(1, aQ);
    }

    public final void a(InProductHelp inProductHelp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) inProductHelp);
        b(17, aQ);
    }

    public final void a(byte[] bArr) {
        Parcel aQ = aQ();
        aQ.writeByteArray(bArr);
        b(13, aQ);
    }
}
