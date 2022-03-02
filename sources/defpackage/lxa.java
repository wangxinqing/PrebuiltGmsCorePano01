package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: lxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxa extends bhv implements lxc {
    public lxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drivingmode.IDrivingModeManager");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(23, aQ);
    }

    public final void b(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(26, aQ);
    }

    public final String c() {
        Parcel a = a(8, aQ());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void d(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(17, aQ);
    }

    public final void e(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(19, aQ);
    }

    public final void f(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, true);
        b(22, aQ);
    }

    public final boolean g() {
        Parcel a = a(16, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean h() {
        Parcel a = a(18, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean i() {
        Parcel a = a(21, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final int j() {
        Parcel a = a(24, aQ());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void k() {
        b(25, aQ());
    }

    public final boolean l() {
        Parcel a = a(27, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final void a(String str, boolean z) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, z);
        b(7, aQ);
    }

    public final void b(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(9, aQ);
    }

    public final void c(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(15, aQ);
    }

    public final boolean d() {
        Parcel a = a(10, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean e() {
        Parcel a = a(12, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean f() {
        Parcel a = a(14, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(11, aQ);
    }

    public final void b(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(13, aQ);
    }

    public final boolean a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(6, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean b() {
        Parcel a = a(1, aQ());
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean a(boolean z, int i) {
        Parcel aQ = aQ();
        bhx.a(aQ, true);
        aQ.writeInt(i);
        Parcel a = a(2, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean b(boolean z, int i) {
        Parcel aQ = aQ();
        bhx.a(aQ, true);
        aQ.writeInt(i);
        Parcel a = a(3, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
