import {createBrowserRouter, RouterProvider} from "react-router-dom";
import AppLayout from "./layout/AppLayout.tsx";
import Error from "./layout/Error.tsx";
import {menuItem} from "./component/api/menuItem.tsx";

function App() {
  const router = createBrowserRouter([
    {
      element: <AppLayout/>,
      errorElement: <Error/>,
      children: menuItem
    }
  ])
  return (<RouterProvider router={router}/>);
}

export default App
