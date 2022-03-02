package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateAuthUriResponse extends AbstractSafeParcelable implements apth {
    public static final Parcelable.Creator CREATOR = new aptx();
    public String a;
    public boolean b;
    public String c;
    public boolean d;
    public StringList e;
    public List f;

    public CreateAuthUriResponse() {
        this.e = StringList.a();
    }

    public final auef a() {
        return (auef) allx.g.c(7);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e, i, false);
        ivx.b(parcel, 7, this.f, false);
        ivx.b(parcel, a2);
    }

    public CreateAuthUriResponse(String str, boolean z, String str2, boolean z2, StringList stringList, List list) {
        StringList stringList2;
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        if (stringList != null) {
            stringList2 = new StringList(stringList.b);
        } else {
            stringList2 = StringList.a();
        }
        this.e = stringList2;
        this.f = list;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        StringList stringList;
        List list;
        if (audx instanceof allx) {
            allx allx = (allx) audx;
            this.a = jlh.b(allx.a);
            this.b = allx.c;
            this.c = jlh.b(allx.d);
            this.d = allx.e;
            if (allx.b.size() != 0) {
                stringList = new StringList(1, new ArrayList(allx.b));
            } else {
                stringList = StringList.a();
            }
            this.e = stringList;
            if (allx.f.size() == 0) {
                list = new ArrayList(0);
            } else {
                list = allx.f;
            }
            this.f = list;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of CreateAuthUriResponse.");
    }
}
