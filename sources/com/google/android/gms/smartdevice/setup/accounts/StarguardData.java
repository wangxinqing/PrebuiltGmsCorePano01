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
public class StarguardData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new acii();
    private static final HashMap c;
    final Set a;
    public String b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("droidguardResult", FastJsonResponse$Field.f("droidguardResult", 2));
    }

    public StarguardData() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return c;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
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

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        if (this.a.contains(2)) {
            ivx.a(parcel, 2, this.b, true);
        }
        ivx.b(parcel, a2);
    }

    public StarguardData(String str) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        hashSet.add(2);
    }

    public StarguardData(Set set, String str) {
        this.a = set;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
