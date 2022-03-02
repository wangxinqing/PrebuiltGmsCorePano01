package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppCompatEditText extends EditText {
    private final yp a;
    private final zr b;
    private final zp c;

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yp ypVar = this.a;
        if (ypVar != null) {
            ypVar.a();
        }
        zr zrVar = this.b;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public final TextClassifier getTextClassifier() {
        zp zpVar;
        if (Build.VERSION.SDK_INT >= 28 || (zpVar = this.c) == null) {
            return super.getTextClassifier();
        }
        return zpVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        yv.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yp ypVar = this.a;
        if (ypVar != null) {
            ypVar.b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yp ypVar = this.a;
        if (ypVar != null) {
            ypVar.a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ry.a((TextView) this, callback));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.b;
        if (zrVar != null) {
            zrVar.a(context, i);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        zp zpVar;
        if (Build.VERSION.SDK_INT >= 28 || (zpVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zpVar.a = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aes.a(context);
        aeq.a((View) this, getContext());
        yp ypVar = new yp(this);
        this.a = ypVar;
        ypVar.a(attributeSet, i);
        zr zrVar = new zr(this);
        this.b = zrVar;
        zrVar.a(attributeSet, i);
        this.b.a();
        this.c = new zp(this);
    }
}
