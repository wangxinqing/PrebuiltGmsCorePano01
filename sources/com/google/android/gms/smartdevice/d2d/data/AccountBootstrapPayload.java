package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountBootstrapPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abvv();
    private static final HashMap g;
    public final Set a;
    public ArrayList b;
    public ArrayList c;
    public ExchangeAssertionsForUserCredentialsRequest d;
    public ArrayList e;
    public ExchangeSessionCheckpointsForUserCredentialsRequest f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("userBootstrapInfos", FastJsonResponse$Field.b("userBootstrapInfos", 2, UserBootstrapInfo.class));
        g.put("challenges", FastJsonResponse$Field.b("challenges", 3, Challenge.class));
        g.put("exchangeAssertionsForUserCredentialsRequest", FastJsonResponse$Field.a("exchangeAssertionsForUserCredentialsRequest", 4, ExchangeAssertionsForUserCredentialsRequest.class));
        g.put("userCredentials", FastJsonResponse$Field.b("userCredentials", 5, UserCredential.class));
        g.put("exchangeSessionCheckpointsForUserCredentialsRequest", FastJsonResponse$Field.a("exchangeSessionCheckpointsForUserCredentialsRequest", 6, ExchangeSessionCheckpointsForUserCredentialsRequest.class));
    }

    public AccountBootstrapPayload() {
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return g;
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

    public AccountBootstrapPayload(Set set, ArrayList arrayList, ArrayList arrayList2, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest, ArrayList arrayList3, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.a = set;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = exchangeAssertionsForUserCredentialsRequest;
        this.e = arrayList3;
        this.f = exchangeSessionCheckpointsForUserCredentialsRequest;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = (ExchangeAssertionsForUserCredentialsRequest) jag;
        } else if (i == 6) {
            this.f = (ExchangeSessionCheckpointsForUserCredentialsRequest) jag;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), jag.getClass().getCanonicalName()}));
        }
        this.a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, i, true);
        }
        if (set.contains(5)) {
            ivx.c(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.f, i, true);
        }
        ivx.b(parcel, a2);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
        } else if (i == 3) {
            this.c = arrayList;
        } else if (i == 5) {
            this.e = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
