package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: rmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface rmo extends IInterface {
    int a(OptInRequest optInRequest);

    ReportingState a(Account account);
}
