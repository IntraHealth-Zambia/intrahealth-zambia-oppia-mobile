/* 
 * This file is part of OppiaMobile - https://digital-campus.org/
 * 
 * OppiaMobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * OppiaMobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with OppiaMobile. If not, see <http://www.gnu.org/licenses/>.
 */

package org.digitalcampus.oppia.fragments;

import org.intrahealth.zambia.oppia.R;
import org.digitalcampus.oppia.activity.WelcomeActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;

public class WelcomeFragment extends Fragment {

	public static final String TAG = WelcomeFragment.class.getSimpleName();

    public static WelcomeFragment newInstance() {
        return new WelcomeFragment();
	}

	private Button loginButton;
    private Button registerButton;

	public WelcomeFragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_welcome, container, false);
        loginButton = (Button) v.findViewById(R.id.welcome_login);
        registerButton = (Button) v.findViewById(R.id.welcome_register);

		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		loginButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                WelcomeActivity wa = (WelcomeActivity) WelcomeFragment.super.getActivity();
                wa.switchTab(WelcomeActivity.TAB_LOGIN);
            }
        });
		
		registerButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                WelcomeActivity wa = (WelcomeActivity) WelcomeFragment.super.getActivity();
                wa.switchTab(WelcomeActivity.TAB_REGISTER);
            }
        });
	}
}
