package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* renamed from: atm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atm extends atl {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public atm(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ou(), new ou(), new ou());
    }

    public final void a(int i2) {
        this.e.writeInt(i2);
    }

    public final void b() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i3);
            this.e.writeInt(dataPosition - i3);
            this.e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public final atl c() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        int i3 = i2;
        return new atm(parcel, dataPosition, i3, this.h + "  ", this.a, this.b, this.c);
    }

    public final int d() {
        return this.e.readInt();
    }

    public final long e() {
        return this.e.readLong();
    }

    public final String f() {
        return this.e.readString();
    }

    public final IBinder g() {
        return this.e.readStrongBinder();
    }

    public final byte[] h() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final CharSequence i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    public final Parcelable j() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    public final boolean k() {
        return this.e.readInt() != 0;
    }

    private atm(Parcel parcel, int i2, int i3, String str, ou ouVar, ou ouVar2, ou ouVar3) {
        super(ouVar, ouVar2, ouVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }

    public final void a(long j2) {
        this.e.writeLong(j2);
    }

    public final void c(int i2) {
        b();
        this.i = i2;
        this.d.put(i2, this.e.dataPosition());
        a(0);
        a(i2);
    }

    public final void a(IBinder iBinder) {
        this.e.writeStrongBinder(iBinder);
    }

    public final boolean b(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    public final void a(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    public final void a(String str) {
        this.e.writeString(str);
    }

    public final void a(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
            return;
        }
        this.e.writeInt(-1);
    }
}
