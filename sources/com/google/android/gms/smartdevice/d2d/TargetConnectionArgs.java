package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetConnectionArgs extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abtd();
    private static final HashMap c;
    public final Set a;
    public SourceDevice b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("sourceDevice", FastJsonResponse$Field.a("sourceDevice", 2, SourceDevice.class));
    }

    public TargetConnectionArgs() {
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

    public TargetConnectionArgs(Set set, SourceDevice sourceDevice) {
        this.a = set;
        this.b = sourceDevice;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = (SourceDevice) jag;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), jag.getClass().getCanonicalName()}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        if (this.a.contains(2)) {
            ivx.a(parcel, 2, this.b, i, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
