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
public class ScreenlockState extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new acig();
    private static final HashMap g;
    final Set a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("isSecureScreenlock", FastJsonResponse$Field.e("isSecureScreenlock", 2));
        g.put("screenlockType", FastJsonResponse$Field.a("screenlockType", 3));
        g.put("screenlockSettingsAgeMillis", FastJsonResponse$Field.b("screenlockSettingsAgeMillis", 4));
        g.put("elapsedTimeSinceUnlockMillis", FastJsonResponse$Field.b("elapsedTimeSinceUnlockMillis", 5));
        g.put("isForcedScreenlock", FastJsonResponse$Field.e("isForcedScreenlock", 6));
    }

    public ScreenlockState() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return g;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Boolean.valueOf(this.b);
        }
        if (i == 3) {
            return Integer.valueOf(this.c);
        }
        if (i == 4) {
            return Long.valueOf(this.d);
        }
        if (i == 5) {
            return Long.valueOf(this.e);
        }
        if (i == 6) {
            return Boolean.valueOf(this.f);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public ScreenlockState(Set set, boolean z, int i, long j, long j2, boolean z2) {
        this.a = set;
        this.b = z;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = i;
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
            ivx.a(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            ivx.b(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f);
        }
        ivx.b(parcel, a2);
    }

    public ScreenlockState(boolean z, int i, long j, long j2, boolean z2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = z;
        hashSet.add(2);
        this.c = i;
        this.a.add(3);
        this.d = j;
        this.a.add(4);
        this.e = j2;
        this.a.add(5);
        this.f = z2;
        this.a.add(6);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = j;
        } else if (i == 5) {
            this.e = j;
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = z;
        } else if (i == 6) {
            this.f = z;
        } else {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
