package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: ytn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ytn extends IInterface {
    void a(String str, String str2);

    void a(ytk ytk);

    void a(ytk ytk, int i, int i2, String str);

    void a(ytk ytk, int i, String str);

    void a(ytk ytk, Uri uri, Bundle bundle);

    void a(ytk ytk, Comment comment);

    void a(ytk ytk, Post post);

    void a(ytk ytk, String str);

    void a(ytk ytk, String str, int i, String str2);

    void a(ytk ytk, String str, int i, String str2, Uri uri, String str3);

    void a(ytk ytk, String str, Audience audience);

    void a(ytk ytk, String str, ApplicationEntity applicationEntity);

    void a(ytk ytk, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4);

    void a(ytk ytk, String str, UpgradeAccountEntity upgradeAccountEntity);

    void a(ytk ytk, String str, String str2);

    void a(ytk ytk, String str, String str2, int i, String str3);

    void a(ytk ytk, String str, String str2, boolean z, String str3);

    String b();

    void b(ytk ytk, int i, int i2, String str);

    void b(ytk ytk, Post post);

    void b(ytk ytk, String str);

    void c(ytk ytk, Post post);

    void c(ytk ytk, String str);

    void d(ytk ytk, String str);

    void e(ytk ytk, String str);

    void f(ytk ytk, String str);
}
