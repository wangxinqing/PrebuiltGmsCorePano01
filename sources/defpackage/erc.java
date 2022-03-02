package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: erc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erc {
    public static List a(Intent intent) {
        return a(intent.getParcelableArrayExtra("accountsAdded"));
    }

    public static List b(Intent intent) {
        return a(intent.getParcelableArrayExtra("accountsRemoved"));
    }

    public static List a(Parcelable[] parcelableArr) {
        int length;
        if (parcelableArr == null || (length = parcelableArr.length) == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (Account add : parcelableArr) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
