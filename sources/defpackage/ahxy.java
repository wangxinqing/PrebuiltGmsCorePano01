package defpackage;

import android.accounts.Account;
import java.util.Comparator;

/* renamed from: ahxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahxy implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Account) obj).name.compareTo(((Account) obj2).name);
    }
}
