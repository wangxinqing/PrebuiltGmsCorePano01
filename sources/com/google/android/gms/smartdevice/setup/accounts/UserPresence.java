package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserPresence extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new acil();
    private static final HashMap g;
    final Set a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public long f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("lockScreenSecure", FastJsonResponse$Field.e("lockScreenSecure", 2));
        g.put("shownLockScreen", FastJsonResponse$Field.e("shownLockScreen", 3));
        g.put("lockScreenQuality", FastJsonResponse$Field.a("lockScreenQuality", 4));
        g.put("lastUnlockDurationInSeconds", FastJsonResponse$Field.b("lastUnlockDurationInSeconds", 5));
        g.put("lockScreenSetupDurationInSeconds", FastJsonResponse$Field.b("lockScreenSetupDurationInSeconds", 6));
    }

    public UserPresence() {
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
            return Boolean.valueOf(this.c);
        }
        if (i == 4) {
            return Integer.valueOf(this.d);
        }
        if (i == 5) {
            return Long.valueOf(this.e);
        }
        if (i == 6) {
            return Long.valueOf(this.f);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public UserPresence(Set set, boolean z, boolean z2, int i, long j, long j2) {
        this.a = set;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = j;
        this.f = j2;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.d = i;
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
            ivx.a(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            ivx.b(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 5) {
            this.e = j;
        } else if (i == 6) {
            this.f = j;
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
        } else if (i == 3) {
            this.c = z;
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
