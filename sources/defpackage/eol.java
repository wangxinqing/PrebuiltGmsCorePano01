package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* renamed from: eol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface eol extends IInterface {
    void a(eon eon, ClearTokenRequest clearTokenRequest);

    void a(eoq eoq, AccountChangeEventsRequest accountChangeEventsRequest);

    void a(eor eor, String str);

    void a(eos eos, Account account);

    void a(eoy eoy, Account account);

    void a(eoz eoz, Account account);

    void a(epa epa, TokenRequest tokenRequest);

    void a(epb epb, String str);

    void a(ifu ifu, Account account, boolean z);
}
