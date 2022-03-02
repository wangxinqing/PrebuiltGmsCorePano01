package com.google.android.gms.auth.account.accounttransfer;

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
    public static final Parcelable.Creator CREATOR = new ejj();
    private static final HashMap h;
    public final Set a;
    final int b;
    public ArrayList c;
    public ArrayList d;
    public ExchangeAssertionsForUserCredentialsRequest e;
    public ArrayList f;
    public ExchangeSessionCheckpointsForUserCredentialsRequest g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("userBootstrapInfos", FastJsonResponse$Field.b("userBootstrapInfos", 2, UserBootstrapInfo.class));
        h.put("challenges", FastJsonResponse$Field.b("challenges", 3, Challenge.class));
        h.put("exchangeAssertionsForUserCredentialsRequest", FastJsonResponse$Field.a("exchangeAssertionsForUserCredentialsRequest", 4, ExchangeAssertionsForUserCredentialsRequest.class));
        h.put("userCredentials", FastJsonResponse$Field.b("userCredentials", 5, UserCredential.class));
        h.put("exchangeSessionCheckpointsForUserCredentialsRequest", FastJsonResponse$Field.a("exchangeSessionCheckpointsForUserCredentialsRequest", 6, ExchangeSessionCheckpointsForUserCredentialsRequest.class));
    }

    public AccountBootstrapPayload() {
        this.b = 2;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return h;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        if (i == 5) {
            return this.f;
        }
        if (i == 6) {
            return this.g;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.e = (ExchangeAssertionsForUserCredentialsRequest) jag;
        } else if (i == 6) {
            this.g = (ExchangeSessionCheckpointsForUserCredentialsRequest) jag;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), jag.getClass().getCanonicalName()}));
        }
        this.a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, i, true);
        }
        if (set.contains(5)) {
            ivx.c(parcel, 5, this.f, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.g, i, true);
        }
        ivx.b(parcel, a2);
    }

    public AccountBootstrapPayload(Set set, int i, ArrayList arrayList, ArrayList arrayList2, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest, ArrayList arrayList3, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.a = set;
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = exchangeAssertionsForUserCredentialsRequest;
        this.f = arrayList3;
        this.g = exchangeSessionCheckpointsForUserCredentialsRequest;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = arrayList;
        } else if (i == 3) {
            this.d = arrayList;
        } else if (i == 5) {
            this.f = arrayList;
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
