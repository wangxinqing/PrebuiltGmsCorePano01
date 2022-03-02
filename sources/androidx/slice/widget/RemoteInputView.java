package androidx.slice.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemoteInputView extends LinearLayout implements View.OnClickListener, TextWatcher {
    public RemoteEditText a;
    private ImageButton b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class RemoteEditText extends EditText {
        RemoteInputView a;

        public RemoteEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            getBackground();
        }

        private final void b() {
            if (this.a != null || c()) {
                c();
            } else if (isFocusable() && isEnabled()) {
                a();
                RemoteInputView remoteInputView = this.a;
                if (remoteInputView != null) {
                    remoteInputView.setVisibility(4);
                }
            }
        }

        private final boolean c() {
            if (Build.VERSION.SDK_INT >= 24) {
                return isTemporarilyDetached();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            setFocusableInTouchMode(false);
            setFocusable(false);
            setCursorVisible(false);
            setBackground((Drawable) null);
        }

        public final void getFocusedRect(Rect rect) {
            super.getFocusedRect(rect);
            rect.top = getScrollY();
            rect.bottom = getScrollY() + (getBottom() - getTop());
        }

        public final void onCommitCompletion(CompletionInfo completionInfo) {
            clearComposingText();
            setText(completionInfo.getText());
            setSelection(getText().length());
        }

        /* access modifiers changed from: protected */
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            if (!z) {
                b();
            }
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return super.onKeyDown(i, keyEvent);
            }
            return true;
        }

        public final boolean onKeyUp(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return super.onKeyUp(i, keyEvent);
            }
            b();
            return true;
        }

        /* access modifiers changed from: protected */
        public final void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            if (!isShown()) {
                b();
            }
        }

        public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
            super.setCustomSelectionActionModeCallback(ry.a((TextView) this, callback));
        }
    }

    public RemoteInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static final void a() {
        new Bundle();
        throw null;
    }

    public final void afterTextChanged(Editable editable) {
        this.b.setEnabled(this.a.getText().length() != 0);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void dispatchFinishTemporaryDetach() {
        if (isAttachedToWindow()) {
            RemoteEditText remoteEditText = this.a;
            attachViewToParent(remoteEditText, 0, remoteEditText.getLayoutParams());
        } else {
            removeDetachedView(this.a, false);
        }
        super.dispatchFinishTemporaryDetach();
    }

    public final void dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach();
        detachViewFromParent(this.a);
    }

    public void onClick(View view) {
        if (view == this.b) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.remote_input_progress);
        ImageButton imageButton = (ImageButton) findViewById(R.id.remote_input_send);
        this.b = imageButton;
        imageButton.setOnClickListener(this);
        RemoteEditText remoteEditText = (RemoteEditText) getChildAt(0);
        this.a = remoteEditText;
        remoteEditText.setOnEditorActionListener(new apr(this));
        this.a.addTextChangedListener(this);
        this.a.a();
        this.a.a = this;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
