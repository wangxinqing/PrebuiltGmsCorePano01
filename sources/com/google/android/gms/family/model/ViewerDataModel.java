package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ViewerDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mho();
    public ob a;
    public ob b;
    public ob c;
    private final SparseBooleanArray d;

    public ViewerDataModel() {
        this.a = new ob();
        this.b = new ob();
        this.c = new ob();
        this.d = new SparseBooleanArray();
    }

    public final boolean a(int i) {
        return this.d.get(i, false);
    }

    public final void b(int i) {
        this.d.put(i, true);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ViewerDataModel) {
            ViewerDataModel viewerDataModel = (ViewerDataModel) obj;
            return this.d.equals(viewerDataModel.d) && this.b.equals(viewerDataModel.b) && this.a.equals(viewerDataModel.a) && this.c.equals(viewerDataModel.c);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSparseBooleanArray(this.d);
        parcel.writeInt(this.a.b);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        parcel.writeInt(this.b.b);
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            parcel.writeString((String) it2.next());
        }
        parcel.writeInt(this.c.b);
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            parcel.writeString((String) it3.next());
        }
    }

    public ViewerDataModel(Parcel parcel) {
        this.d = parcel.readSparseBooleanArray();
        this.a = new ob();
        this.b = new ob();
        this.c = new ob();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a.add(parcel.readString());
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.b.add(parcel.readString());
        }
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.c.add(parcel.readString());
        }
    }
}
