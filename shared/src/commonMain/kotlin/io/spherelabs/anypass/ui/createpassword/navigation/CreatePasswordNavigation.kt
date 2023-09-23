package io.spherelabs.anypass.ui.createpassword.navigation

import io.spherelabs.anypass.navigation.Route
import io.spherelabs.anypass.ui.createpassword.GeneratePasswordRoute
import io.spherelabs.navigation.NavHostScope
import io.spherelabs.navigation.NavigationController
import io.spherelabs.navigation.composable

fun NavigationController<Route>.navigateToCreatePassword() {
    this.navigateTo(Route.CreatePassword)
}

fun NavHostScope<Route>.createPasswordScreen(
    navigateToHome: () -> Unit,
    navigateToBack: () -> Unit
) {
    this.composable<Route.CreatePassword> {
        GeneratePasswordRoute(
            navigateToBack = {
                navigateToBack.invoke()
            }
        )
    }
}