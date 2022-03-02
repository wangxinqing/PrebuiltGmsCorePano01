package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExchangeSessionCheckpointsForUserCredentialsRequest extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new achz();
    private static final HashMap d;
    final Set a;
    public ArrayList b;
    public DeviceRiskSignals c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("sessionCheckpoints", FastJsonResponse$Field.b("sessionCheckpoints", 2, SessionCheckpoint.class));
        d.put("targetDeviceRiskSignals", FastJsonResponse$Field.a("targetDeviceRiskSignals", 3, DeviceRiskSignals.class));
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = (DeviceRiskSignals) jag;
            this.a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), jag.getClass().getCanonicalName()}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, i, true);
        }
        ivx.b(parcel, a2);
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = arrayList;
        hashSet.add(2);
        a((DeviceRiskSignals) null);
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest(Set set, ArrayList arrayList, DeviceRiskSignals deviceRiskSignals) {
        this.a = set;
        this.b = arrayList;
        this.c = deviceRiskSignals;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
            this.a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(DeviceRiskSignals deviceRiskSignals) {
        this.c = deviceRiskSignals;
        this.a.add(3);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
