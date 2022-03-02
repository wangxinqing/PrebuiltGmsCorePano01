package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;

/* renamed from: zmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface zmq extends zma {
    void a(Bitmap bitmap);

    void a(ConnectionResult connectionResult);

    void a(ConnectionResult connectionResult, Post post);

    void a(ConnectionResult connectionResult, Settings settings);

    void a(ConnectionResult connectionResult, ysw ysw);

    void a(Status status);

    void a(Status status, AddToCircleData addToCircleData);

    void a(Status status, Circle circle);

    void a(Status status, String str, String[] strArr);

    void a(String[] strArr, int i);
}
