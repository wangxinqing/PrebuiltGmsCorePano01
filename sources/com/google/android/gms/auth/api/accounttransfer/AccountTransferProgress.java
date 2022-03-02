package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountTransferProgress extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new etr();
    private static final nz g;
    final int a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;

    static {
        nz nzVar = new nz();
        g = nzVar;
        nzVar.put("registered", FastJsonResponse$Field.g("registered", 2));
        g.put("in_progress", FastJsonResponse$Field.g("in_progress", 3));
        g.put("success", FastJsonResponse$Field.g("success", 4));
        g.put("failed", FastJsonResponse$Field.g("failed", 5));
        g.put("escrowed", FastJsonResponse$Field.g("escrowed", 6));
    }

    public AccountTransferProgress() {
        this.a = 1;
    }

    private static final void a(Map map, List list, String str) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                map.put((String) list.get(i), str);
            }
        }
    }

    public final Map a() {
        return g;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    public AccountTransferProgress(int i, List list, List list2, List list3, List list4, List list5) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c, false);
        ivx.b(parcel, 4, this.d, false);
        ivx.b(parcel, 5, this.e, false);
        ivx.b(parcel, 6, this.f, false);
        ivx.b(parcel, a2);
    }

    public final Map b() {
        nz nzVar = new nz();
        a(nzVar, this.b, "registered");
        a(nzVar, this.c, "in_progress");
        a(nzVar, this.d, "success");
        a(nzVar, this.e, "failed");
        a(nzVar, this.f, "escrowed");
        return nzVar;
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
        } else if (i == 3) {
            this.c = arrayList;
        } else if (i == 4) {
            this.d = arrayList;
        } else if (i == 5) {
            this.e = arrayList;
        } else if (i == 6) {
            this.f = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(i)}));
        }
    }
}
