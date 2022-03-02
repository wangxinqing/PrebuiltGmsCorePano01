package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* renamed from: wzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface wzy extends IInterface {
    Bundle a(String str, String str2);

    Bundle a(String str, String str2, long j);

    Bundle a(String str, String str2, long j, boolean z);

    Bundle a(String str, String str2, long j, boolean z, boolean z2);

    Bundle a(wzv wzv, boolean z, String str, String str2, int i);

    itp a(wzv wzv, AccountToken accountToken, ParcelableListOptions parcelableListOptions);

    itp a(wzv wzv, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions);

    itp a(wzv wzv, String str);

    itp a(wzv wzv, String str, int i);

    itp a(wzv wzv, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2);

    void a(wzv wzv, Account account, String str);

    void a(wzv wzv, Uri uri);

    void a(wzv wzv, Uri uri, String str);

    void a(wzv wzv, Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    void a(wzv wzv, Bundle bundle);

    void a(wzv wzv, AccountToken accountToken, List list, ParcelableGetOptions parcelableGetOptions);

    void a(wzv wzv, String str, int i, int i2);

    void a(wzv wzv, String str, String str2);

    void a(wzv wzv, String str, String str2, int i);

    void a(wzv wzv, String str, String str2, int i, int i2);

    void a(wzv wzv, String str, String str2, Uri uri);

    void a(wzv wzv, String str, String str2, Uri uri, boolean z);

    void a(wzv wzv, String str, String str2, String str3);

    void a(wzv wzv, String str, String str2, String str3, int i, String str4);

    void a(wzv wzv, String str, String str2, String str3, int i, String str4, boolean z);

    void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4);

    void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2);

    void a(wzv wzv, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5);

    void a(wzv wzv, String str, String str2, String str3, List list);

    void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j);

    void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2);

    void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3);

    void a(wzv wzv, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3, int i4);

    void a(wzv wzv, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity);

    void a(wzv wzv, String str, String str2, String str3, boolean z, int i);

    void a(wzv wzv, String str, String str2, String str3, boolean z, int i, int i2);

    void a(wzv wzv, String str, String str2, String[] strArr);

    void a(wzv wzv, boolean z, boolean z2, String str, String str2);

    void a(wzv wzv, boolean z, boolean z2, String str, String str2, int i);

    Bundle b(String str, String str2);

    itp b(wzv wzv, String str, int i, int i2);

    itp b(wzv wzv, String str, String str2, int i, int i2);

    void b();

    void b(wzv wzv, Account account, String str);

    void b(wzv wzv, String str);

    void b(wzv wzv, String str, String str2);

    void b(wzv wzv, String str, String str2, int i);

    void b(wzv wzv, String str, String str2, String str3, int i, String str4);

    itp c(wzv wzv, String str, String str2, int i);

    void c();

    void c(wzv wzv, Account account, String str);

    void c(wzv wzv, String str, String str2);

    void d(wzv wzv, Account account, String str);

    void d(wzv wzv, String str, String str2);

    itp e(wzv wzv, String str, String str2);
}
