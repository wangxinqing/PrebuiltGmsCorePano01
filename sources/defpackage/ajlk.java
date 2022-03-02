package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.List;

/* renamed from: ajlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ajlk extends IInterface {
    AccountConfig a(Account account);

    List a(Account account, int i, boolean z, String str);

    void a(Account account, String str, boolean z, String str2);

    List b(Account account);

    void b(Account account, String str, boolean z, String str2);
}
