package defpackage;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: ode  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ode implements TextWatcher {
    final /* synthetic */ ChatConversationChimeraActivity a;

    public ode(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.a = chatConversationChimeraActivity;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.a.m) {
            boolean a2 = ChatConversationChimeraActivity.a((CharSequence) editable);
            this.a.c(a2);
            this.a.b(!a2);
            this.a.w = SystemClock.uptimeMillis();
            axnx.c();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
