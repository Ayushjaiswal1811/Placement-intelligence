import { useEffect, useState } from "react";
import api from "../api/axios";

export default function Dashboard() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    api.get("/api/students").then(res => setStudents(res.data));
  }, []);

  return (
    <div>
      <h2>Dashboard</h2>
      {students.map(s => (
        <p key={s.id}>{s.name}</p>
      ))}
    </div>
  );
}
