package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* renamed from: esl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class esl extends ibn {
    public final /* bridge */ /* synthetic */ ibo a(Context context, Looper looper, ise ise, Object obj, ica ica, icb icb) {
        return new fwb(context, looper, ise, (GoogleSignInOptions) obj, ica, icb);
    }

    public final /* bridge */ /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.a();
    }
}
