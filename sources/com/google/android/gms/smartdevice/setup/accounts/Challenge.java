package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Challenge extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new acht();
    private static final HashMap g;
    final Set a;
    public int b;
    public String c;
    public String d;
    public byte[] e;
    public byte[] f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("status", FastJsonResponse$Field.a("status", 2));
        g.put("accountIdentifier", FastJsonResponse$Field.f("accountIdentifier", 3));
        g.put("reason", FastJsonResponse$Field.f("reason", 4));
        g.put("challenge", FastJsonResponse$Field.h("challenge", 5));
        g.put("challengeSessionState", FastJsonResponse$Field.h("challengeSessionState", 6));
    }

    public Challenge() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return g;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Integer.valueOf(this.b);
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        if (i == 6) {
            return this.f;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void c(byte[] bArr) {
        this.e = bArr;
        this.a.add(5);
    }

    public final void d(byte[] bArr) {
        this.f = bArr;
        this.a.add(6);
    }

    public final void e(String str) {
        this.c = str;
        this.a.add(3);
    }

    public Challenge(int i, String str, String str2, byte[] bArr, byte[] bArr2) {
        this();
        a(i);
        e(str);
        this.d = str2;
        this.a.add(4);
        c(bArr);
        d(bArr2);
    }

    public final void a(int i) {
        this.b = i;
        this.a.add(2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public Challenge(Set set, int i, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = bArr2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = str2;
        } else if (i == 4) {
            this.d = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)}));
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.e = bArr;
        } else if (i == 6) {
            this.f = bArr;
        } else {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an byte array.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
