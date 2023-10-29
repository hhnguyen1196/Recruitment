import {MouseEventHandler, ReactNode} from "react";

type Props = {
  children?: ReactNode;
  onClick: MouseEventHandler<HTMLButtonElement>;
  type: string
}

type Styles = {
  [key: string]: string;
};

const Button = ({children, onClick, type}: Props) => {
  const base = "rounded-md px-4 py-2 text-white bg-blue-600 hover:bg-blue-500";
  const styles: Styles = {
    login: base,
    goHome: base
  };
  return (
    <button onClick={onClick} className={styles[type]}>{children}</button>
  );
};

export default Button;