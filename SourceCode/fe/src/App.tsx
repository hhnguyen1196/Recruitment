import {createBrowserRouter, RouterProvider} from "react-router-dom";
import AppLayout from "./layout/AppLayout.tsx";
import Error from "./layout/Error.tsx";
import {routes} from "./component/routes/routes.tsx";

function App() {
  const router = createBrowserRouter([
    {
      element: <AppLayout/>,
      errorElement: <Error/>,
      children: routes
    }
  ])
  return <RouterProvider router={router}/>;
}

export default App
