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
public class Assertion extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new achs();
    private static final HashMap h;
    final Set a;
    public String b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("accountIdentifier", FastJsonResponse$Field.f("accountIdentifier", 2));
        h.put("clientData", FastJsonResponse$Field.h("clientData", 3));
        h.put("encryptedUserAssertion", FastJsonResponse$Field.h("encryptedUserAssertion", 4));
        h.put("challengeSessionState", FastJsonResponse$Field.h("challengeSessionState", 5));
        h.put("challenge", FastJsonResponse$Field.h("challenge", 6));
        h.put("assertionType", FastJsonResponse$Field.a("assertionType", 7));
    }

    public Assertion() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return h;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
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
            case 7:
                return Integer.valueOf(this.g);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 7) {
            this.g = i;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
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
        if (set.contains(7)) {
            ivx.b(parcel, 7, this.g);
        }
        ivx.b(parcel, a2);
    }

    public Assertion(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        hashSet.add(2);
        this.c = bArr;
        this.a.add(3);
        this.d = bArr2;
        this.a.add(4);
        this.e = bArr3;
        this.a.add(5);
        this.f = bArr4;
        this.a.add(6);
        this.g = 1;
        this.a.add(7);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)}));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = bArr;
        } else if (i == 4) {
            this.d = bArr;
        } else if (i == 5) {
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

    public Assertion(Set set, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        this.a = set;
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = i;
    }
}
