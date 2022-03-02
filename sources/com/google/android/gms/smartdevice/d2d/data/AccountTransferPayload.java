package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountTransferPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abvw();
    private static final acpz d = acqa.a("D2D", "AccountTransferPayload");
    private static final Map e;
    final Set a;
    final int b;
    public byte[] c;

    static {
        nz nzVar = new nz();
        e = nzVar;
        nzVar.put("accountTransferMsg", FastJsonResponse$Field.h("accountTransferMsg", 2));
    }

    public AccountTransferPayload() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final Map a() {
        return e;
    }

    public final AccountTransferMsg b() {
        if (this.c == null) {
            return null;
        }
        AccountTransferMsg accountTransferMsg = new AccountTransferMsg();
        try {
            new jas().a((InputStream) new ByteArrayInputStream(this.c), (jag) accountTransferMsg);
            return accountTransferMsg;
        } catch (jaq e2) {
            throw new gqu(e2.getMessage());
        } catch (gqu e3) {
            d.e("Failed populating AccountTransferMsg from bytes", e3, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = bArr;
            this.a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(57);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a byte array");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, true);
        }
        ivx.b(parcel, a2);
    }

    public AccountTransferPayload(AccountTransferMsg accountTransferMsg) {
        byte[] bArr;
        this.b = 1;
        this.a = new HashSet();
        try {
            bArr = accountTransferMsg.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            Log.e(com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson.h, "Error serializing object.", e2);
            bArr = null;
        }
        this.c = bArr;
        this.a.add(2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AccountTransferPayload(Set set, int i, byte[] bArr) {
        this.a = set;
        this.b = i;
        this.c = bArr;
    }
}
