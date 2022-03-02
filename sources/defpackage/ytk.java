package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.internal.model.acls.AclsResponse;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: ytk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ytk extends IInterface {
    void a(int i, Bundle bundle);

    void a(int i, Bundle bundle, Bundle bundle2);

    void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    void a(int i, Bundle bundle, AclsResponse aclsResponse);

    void a(int i, Bundle bundle, AppAclsEntity appAclsEntity);

    void a(int i, Bundle bundle, Comment comment);

    void a(int i, Bundle bundle, Post post);

    void a(int i, Bundle bundle, Settings settings);

    void a(int i, Bundle bundle, MomentsFeed momentsFeed);

    void a(int i, Bundle bundle, PeopleFeed peopleFeed);

    void a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity);

    void a(int i, Bundle bundle, String str);

    void a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity);

    void a(int i, Bundle bundle, List list);

    void a(DataHolder dataHolder, String str);

    void a(String str);

    void b(int i, Bundle bundle);
}
