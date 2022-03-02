package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class LoaderSectionInfo extends SectionInfo {
    public final String a;
    public String[] b;
    public boolean c;
    public String d;
    public boolean e;
    protected boolean f;
    public String g;
    public String h;
    public int i;
    public int j = Integer.MAX_VALUE;
    public int k = Integer.MAX_VALUE;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;

    public LoaderSectionInfo(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.createStringArray();
        boolean z = true;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readString();
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt() == 0 ? false : z;
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readArrayList(ContactPerson.class.getClassLoader());
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str = (String) arrayList.get(i2);
                if (str != null) {
                    arrayList.set(i2, str.toLowerCase());
                }
            }
        }
        this.n = arrayList;
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str = (String) arrayList.get(i2);
                if (str != null) {
                    arrayList.set(i2, PhoneNumberUtils.stripSeparators(str));
                }
            }
        }
        this.o = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.a);
        parcel.writeStringArray(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
    }

    public LoaderSectionInfo(String str) {
        this.a = str;
    }
}
