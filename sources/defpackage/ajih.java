package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.places.personalized.UserPlace;
import com.google.android.gms.location.places.personalized.UserPlacesResult;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ajih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajih {
    private final Context a;

    public ajih(Context context) {
        new HashSet();
        new HashSet();
        this.a = context;
    }

    public final String[] a(Account account) {
        List list;
        riq riq = new riq();
        riq.d = account.name;
        icc icc = rij.b(this.a, riq.a()).j;
        rli rli = new rli(rij.a, icc);
        icc.a((idf) rli);
        acwa a2 = iux.a((icf) rli, new ick());
        try {
            acws.a(a2, aztb.a.a().by(), TimeUnit.MILLISECONDS);
            List<UserPlace> list2 = ((UserPlacesResult) ((ick) a2.d()).a).b;
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            String[] strArr = new String[2];
            for (UserPlace userPlace : list2) {
                String str = userPlace.a;
                if (!(str == null || (list = userPlace.b) == null || list.isEmpty())) {
                    if (list.contains(1)) {
                        strArr[0] = str;
                    }
                    if (list.contains(2)) {
                        strArr[1] = str;
                    }
                }
            }
            if (strArr[0] == null && strArr[1] == null) {
                return null;
            }
            return strArr;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Exception on getUserPlaces:");
            sb.append(valueOf);
            ajix.c("GCoreUlr", sb.toString());
            return null;
        }
    }
}
