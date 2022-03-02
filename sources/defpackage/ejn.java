package defpackage;

import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: ejn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ejn {
    protected final etl a;

    public ejn(etl etl) {
        this.a = etl;
    }

    private static Object a(acwa acwa) {
        return acws.a(acwa, ent.af(), TimeUnit.SECONDS);
    }

    public final AccountBootstrapPayload b() {
        etl etl = this.a;
        iva.a((Object) "com.google");
        byte[] bArr = (byte[]) a(etl.a((ihb) new esy(new RetrieveDataRequest("com.google"))));
        if (bArr == null || bArr.length == 0) {
            throw new ejk("TransferBytes is null or empty");
        }
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        try {
            accountBootstrapPayload.e(bArr);
            return accountBootstrapPayload;
        } catch (acpi e) {
            throw new ejk("TransferBytes could not be serialized to AccountBootstrapPayload");
        }
    }

    public final DeviceMetaData a() {
        etl etl = this.a;
        iva.a((Object) "com.google");
        return (DeviceMetaData) a(etl.a((ihb) new eta(new DeviceMetaDataRequest("com.google"))));
    }
}
