package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aceh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aceh {
    public static int a(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 1;
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            UserCredential userCredential = (UserCredential) list.get(i);
            Bundle bundle = new Bundle();
            bundle.putString("name", userCredential.b);
            if (TextUtils.isEmpty(userCredential.e)) {
                bundle.putString("credential", userCredential.f);
            } else {
                bundle.putString("url", userCredential.e);
            }
            if (!TextUtils.isEmpty(userCredential.g)) {
                bundle.putString("firstName", userCredential.g);
            }
            if (!TextUtils.isEmpty(userCredential.h)) {
                bundle.putString("lastName", userCredential.h);
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static ArrayList a(UserCredential[] userCredentialArr) {
        return a((List) new ArrayList(Arrays.asList(userCredentialArr)));
    }
}
