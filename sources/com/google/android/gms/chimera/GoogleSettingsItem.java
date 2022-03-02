package com.google.android.gms.chimera;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleSettingsItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new heb();
    public final int a;
    public final Intent b;
    public final int c;
    public String d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;
    public boolean k;
    public List l;
    public boolean m;
    public String n;
    public int o;
    public int p;
    public int q;

    public GoogleSettingsItem(int i2, Intent intent, int i3, String str, int i4, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, List list, boolean z6, String str3, int i5) {
        this.a = i2;
        this.b = intent;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str2;
        this.j = z4;
        this.k = z5;
        this.l = list;
        this.m = z6;
        this.n = str3;
        this.o = i5;
        this.p = -1;
        this.q = -1;
    }

    public final void a() {
        this.k = true;
    }

    public final void b() {
        this.m = true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        heb.a(this, parcel, i2);
    }

    public GoogleSettingsItem(Intent intent, int i2, int i3, int i4) {
        this(3, intent, i2, (String) null, -1, false, false, false, (String) null, true, false, (List) null, true, (String) null, i4 - 1);
        this.p = i3;
    }

    public final void a(String str) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(str);
    }

    public GoogleSettingsItem(Intent intent, int i2, String str, int i3) {
        this(3, intent, i2, str, -1, false, false, false, (String) null, true, false, (List) null, true, (String) null, i3 - 1);
    }
}
