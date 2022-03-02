package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new fx();
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public BackStackState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackState(fw fwVar) {
        int size = fwVar.d.size();
        this.a = new int[(size * 5)];
        if (fwVar.j) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                hs hsVar = (hs) fwVar.d.get(i2);
                int i4 = i3 + 1;
                this.a[i3] = hsVar.a;
                ArrayList arrayList = this.b;
                gj gjVar = hsVar.b;
                arrayList.add(gjVar != null ? gjVar.q : null);
                int i5 = i4 + 1;
                int[] iArr = this.a;
                iArr[i4] = hsVar.c;
                int i6 = i5 + 1;
                iArr[i5] = hsVar.d;
                int i7 = i6 + 1;
                iArr[i6] = hsVar.e;
                iArr[i7] = hsVar.f;
                this.c[i2] = hsVar.g.ordinal();
                this.d[i2] = hsVar.h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.e = fwVar.i;
            this.f = fwVar.l;
            this.g = fwVar.c;
            this.h = fwVar.m;
            this.i = fwVar.n;
            this.j = fwVar.o;
            this.k = fwVar.p;
            this.l = fwVar.q;
            this.m = fwVar.r;
            this.n = fwVar.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
